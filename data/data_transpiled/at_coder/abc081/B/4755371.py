def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
        self.list = [ ]
        N = int ( sys.stdin.readline ( ).strip ( ) )
        for i in range ( N ) :
            self.list.append ( int ( sys.stdin.readline ( ).strip ( ) ) )
        out :
            while True :
                for i in range ( N ) :
                    elm = self.list [ i ]
                    if elm % 2 == 1 :
                        sys.stdout.write ( count )
                        break
                    else :
                        self.list [ i ] = elm // 2
                count += 1
