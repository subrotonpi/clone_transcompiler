def import string
import sys
import string
class Main ( object ) :
    def __init__ ( self ) :
        sc = string.ascii_lowercase
        s = sc.decode ( 'utf-8' )
        if len ( s ) == 26 :
            s = s [ 25 : ]
            for i in range ( 24 , 0 , - 1 ) :
                if s.higher ( s [ i ] ) :
                    print ( s [ : i ] , s.higher ( s [ i ] ) )
                    return
                else :
                    s.add ( s [ i ] )
            print ( - 1 )
        else :
            for i in [ 'a' , 'z' ] :
                if s.find ( i ) == - 1 :
                    print ( s , chr ( i ) )
                    break
