def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = 'A'
            j = int ( a )
            s = self.sc.readline ( )
            b = s [ 0 ]
            i = int ( b )
            print ( i - j + 1 )
