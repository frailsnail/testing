
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        Intro.java \
	Story.java \
	Part1.java \
	Mechanics.java

default: Intro.class Story.class Part1.class Mechanics.class

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class *~
