def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.out = sys.stdout
            self.data = sys.stdin.read ( )
            ans = 0
            for char in self.data :
                if char in string.ascii_letters :
                    ans = ans * 10 + int ( char )
            print ( ans )
    return Main
