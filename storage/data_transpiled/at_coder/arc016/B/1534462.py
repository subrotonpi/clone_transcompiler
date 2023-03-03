def import sys , glob
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.ans = 0
        music = [ ]
        for s in glob.glob ( "*.*" ) :
            for i in range ( 9 ) :
                music [ i ] [ j ] = s [ i ]
                if music [ i ] [ j ] == "x" :
                    self.ans += 1
        for j in range ( 9 ) :
            flg = 0
            for i in range ( N ) :
                if music [ i ] [ j ] == "o" and flg == 0 :
                    flg = 1
                    self.ans += 1
                elif music [ i ] [ j ] != "o" :
                    flg = 0
        print ( self.ans )
