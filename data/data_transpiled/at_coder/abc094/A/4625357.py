def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            A , B , X = self.scn.read ( ).split ( ' ' )
            print ( 'YES' if A <= X <= A + B else 'NO' )
    return Main
