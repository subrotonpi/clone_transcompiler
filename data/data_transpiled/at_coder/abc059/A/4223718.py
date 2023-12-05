def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = sys.stdin.read ( )
            self.c = sys.stdin.read ( )
        def write ( self , a , b , c ) :
            self.a = a
            self.b = b
            self.c = c
    print ( chr ( ord ( a ) - 0x20 ) , end = ' ' )
    print ( chr ( ord ( b ) - 0x20 ) , end = ' ' )
    print ( chr ( ord ( c ) - 0x20 ) , end = ' ' )
