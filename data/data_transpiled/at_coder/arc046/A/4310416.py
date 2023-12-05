def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __call__ ( self ) :
        self.n = sys.stdin.read ( )
    idx = 1
    count = 0
    while True :
        x = idx
        prev = x % 10
        flag = True
        while x > 0 :
            if prev != x % 10 :
                flag = False
                break
            x /= 10
        if flag :
            count += 1
            if count == n :
                print ( idx )
                return
        idx += 1
