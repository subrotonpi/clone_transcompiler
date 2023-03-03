def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            a = scn.read ( ).decode ( 'utf-8' )
            b = scn.read ( ).decode ( 'utf-8' )
            c = scn.read ( ).decode ( 'utf-8' )
            ans = ""
            ans += a
            ans += b
            ans += c
            print ( ans )
    return Main
