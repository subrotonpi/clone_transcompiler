def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.solve ( )
        def solve ( self ) :
            with open ( '/proc/self/stat' , 'r' ) as sc :
                a , b , c , d = [ int ( x ) for x in sc.read ( ).split ( ) ]
                sc.close ( )
                PlayerA = float ( b ) / a
                PlayerB = float ( d ) / c
                if PlayerA > PlayerB :
                    print ( 'TAKAHASHI' )
                elif PlayerA < PlayerB :
                    print ( 'AOKI' )
                else :
                    print ( 'DRAW' )
    return Main ( )
