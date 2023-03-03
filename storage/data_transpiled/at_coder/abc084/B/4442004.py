def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = int ( sys.stdin.readline ( ).strip ( ) )
            self.B = int ( sys.stdin.readline ( ).strip ( ) )
        def __getitem__ ( self , key ) :
            S = self.S
            if key in S [ 0 ] :
                print ( "No" )
                return
            if not ( key in S [ A ] ) :
                print ( "No" )
                return
            if key in S [ A + 1 : A + B + 1 ] :
                print ( "No" )
                return
            print ( "Yes" )
    return Main ( )
