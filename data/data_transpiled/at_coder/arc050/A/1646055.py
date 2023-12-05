def import _solve
class Main ( object ) :
    def solve ( self ) :
        with open ( '/etc/init.d/' , 'r' ) as f :
            s = f.read ( )
        c1 , c2 = s [ 0 ] , s [ 2 ].upper ( )
        print ( 'Yes' if c1 == c2 else 'No' )
