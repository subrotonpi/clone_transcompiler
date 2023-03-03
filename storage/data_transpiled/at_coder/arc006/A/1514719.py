def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.e = sys.stdin.readline ( )
        self.b = sys.stdin.readline ( )
        self.l = sys.stdin.readline ( ).split ( )
        sa , bo = 0 , 0
        for i in self.l :
            if i in e :
                sa += 1
            else :
                if b == i :
                    bo += 1
        if sa == 6 :
            self.a = 1
        elif sa == 5 and bo == 1 :
            self.a = 2
        elif sa == 5 :
            self.a = 3
        elif sa == 4 :
            self.a = 4
        elif sa == 3 :
            self.a = 5
        else :
            self.a = 0
