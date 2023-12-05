def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    class Main ( object ) :
        def __init__ ( self ) :
            self.abc116A = Main ( )
            with open ( 'a.txt' , 'r' ) as f :
                x , y , z = f.read ( ).split ( )
            print ( self.abc116A.solve ( x , y , z ) )
        def solve ( self , x , y , z ) :
            a = [ x , y , z ]
            a.sort ( )
            return a [ 0 ] * a [ 1 ] / 2
    return Main ( )
