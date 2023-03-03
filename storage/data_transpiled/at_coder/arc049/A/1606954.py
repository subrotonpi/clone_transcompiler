def import import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( 'test.txt' , 'r' ) as f :
            s = f.read ( )
        a = [ i for i in range ( 4 ) ]
        t = 0
        for i in s :
            if t < 4 and i == a [ t ] :
                t += 1
                print ( "\u" , end = ' ' )
            print ( i , end = ' ' )
        if len ( s ) == a [ 3 ] :
            print ( "\u" , end = ' ' )
        print ( )
