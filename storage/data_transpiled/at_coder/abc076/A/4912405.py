def main ( ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.A = A
        def A ( self ) :
            with open ( "/tmp/" ) as sc :
                r = sc.read ( )
                g = sc.read ( )
                print ( 2 * g - r )
    return A
