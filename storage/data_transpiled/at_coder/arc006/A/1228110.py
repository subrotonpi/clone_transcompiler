def import import sys , string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        s = string.split ( string.replace ( "" , "" ) )
        b , c = [ ] , [ ]
        a = [ ]
        bonus = 0
        count = 0
        for i in range ( 6 ) :
            a.append ( s.choice ( string.split ( "" ) ) )
        b = s.choice ( string.split ( "" ) )
        for i in range ( 6 ) :
            c.append ( s.choice ( string.split ( "" ) ) )
        for i in range ( 6 ) :
            if a.pop ( int ( c [ i ] ) ) :
                count += 1
            else :
                bonus |= c [ i ] == b
    res = 0
    if count == 3 or count == 4 :
        res = 8 - count
    elif count == 5 :
        res = 2 if bonus else 3
    elif count == 6 :
        res = 1
    print ( res )
