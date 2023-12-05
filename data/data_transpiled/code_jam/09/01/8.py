def import _alienlanguage
import sys
import os
import sys
import sys
import os
import sys
import sys
class AlienLanguage ( object ) :
    def __init__ ( self ) :
        pass
    def __init__ ( self ) :
        pass
    def read ( ) :
        return sys.stdin.read ( )
    def write ( ) :
        return sys.stdout.write ( "A-large.in\n" )
    def write ( ) :
        return sys.stdout.write ( "A-large.out\n" )
    def write ( ) :
        return sys.stdin.read ( )
    def write ( ) :
        return sys.stdout.write ( "A-large.out\n" )
    line = [ ]
    line = line.split ( )
    L , D , N = [ int ( x ) for x in line [ : L ] ]
    word = [ ]
    for i in range ( D ) :
        line = read ( )
        for j in range ( L ) :
            word [ i ].append ( line [ j ] )
    for i in range ( 1 , N + 1 ) :
        line = read ( )
        b = [ ]
        for j in range ( L ) :
            c = line [ j ]
            if bracket == False :
                if c == '(' :
                    bracket = True
                else :
                    b [ k ] [ int ( c ) - int ( 'a' ) ] = True
                    k += 1
            else :
                if c == ')' :
                    bracket = False
                    k += 1
                else :
                    b [ k ] [ int ( c ) - int ( 'a' ) ] = True
        score = 0
        for j in range ( D ) :
            good = True
            for k in range ( L ) :
                if b [ k ] [ int ( word [ j ] [ k ] ) - int ( 'a' ) ] == False :
                    good = False
                    break
            if good == True :
                score += 1
        write ( )
    write ( )
