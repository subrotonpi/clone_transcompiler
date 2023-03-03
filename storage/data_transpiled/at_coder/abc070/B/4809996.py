def main ( arg = None ) :
    import sys
    class Main ( object ) :
        def __init__ ( self , arg ) :
            sys.argv = arg
            A = sys.stdin.read ( )
            B = sys.stdin.read ( )
            C = sys.stdin.read ( )
            D = sys.stdin.read ( )
            sys.stdin.close ( )
            print ( self.subAbs ( A , B , C , D ) )
        def subAbs ( self , A , B , C , D ) :
            sub = min ( B , D ) - max ( A , C )
            if sub > 0 :
                return sub
            else :
                return 0
    return Main ( )
