def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = _main ( )
    def __init__ ( self ) :
        self.arr = _main ( )
    flag = False
    total = sum = 0
    for c in arr :
        if flag :
            total += 9
        else :
            if c == '9' :
                total += 9
            else :
                if total == 0 :
                    total += c - '0' - 1
                    flag = True
                else :
                    total -= 1
                    total += 9
                    flag = True
        sum += c - '0'
    print ( max ( total , sum ) )
