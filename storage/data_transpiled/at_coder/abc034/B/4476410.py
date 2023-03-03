def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            num = self.scn.read ( )
            ans = 0
            if num % 2 == 0 :
                ans = num - 1
            else :
                ans = num + 1
            print ( ans )
    return Main ( )
