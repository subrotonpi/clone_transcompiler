def import re
import sys
import os
import sys
import re
import sys
class Alien ( object ) :
    def __init__ ( self ) :
        self.input = sys.stdin
        self.output = sys.stdout
        self.word_length = sys.stdin.readline ( ).rstrip ( '\n' )
        self.word_count = sys.stdin.readline ( ).rstrip ( '\n' )
        self.test_count = sys.stdin.readline ( ).rstrip ( '\n' )
        self.dictionary = set ( [ self.word for self in self.word_count ] )
        for i in range ( 1 , self.test_count + 1 ) :
            solution = solve ( self.dictionary , self.dictionary )
            self.output.write ( 'Case #%d: %d\n' % ( i , solution ) )
    def solve ( self , dict , pattern ) :
        buffer = [ ]
        in_group = False
        for c in pattern :
            if c == '(' :
                in_group = True
            elif c == ')' :
                in_group = False
            elif in_group and buffer [ - 1 ] != '(' :
                buffer.append ( '|' )
            buffer.append ( c )
        regex = re.compile ( '|'.join ( buffer ) )
        total = 0
        for w in dict :
            if regex.match ( w ) :
                total += 1
        return total
