def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.five , self.seven = 0 , 0
            for i in range ( 3 ) :
                x = sys.stdin.read ( )
                if x == 5 :
                    five += 1
                elif x == 7 :
                    seven += 1
            if five != 2 or seven != 1 :
                answer = "NO"
            else :
                answer = "YES"
            print ( answer )
