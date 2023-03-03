def main ( ) :
    import sys
    class Main ( object ) :
        @ staticmethod
        def eval ( ) :
            N = sys.stdin.readline ( ).strip ( )
            S = sys.stdin.read ( ).strip ( )
            x = 0
            max = 0
            for s in S :
                if s == 'I' :
                    x += 1
                    if max < x :
                        max = x
                elif s == 'D' :
                    x -= 1
            print ( max )
