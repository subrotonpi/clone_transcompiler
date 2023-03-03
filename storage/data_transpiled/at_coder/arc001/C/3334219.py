def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.befor = sys.stdin.read ( )
        self.after = sys.stdin.read ( )
        if self.after > self.befor :
            tmp = self.after - self.befor
        else :
            tmp = self.befor - self.after
    count = 0
    while tmp != 0 :
        if tmp >= 10 :
            tmp -= 10
            count += 1
        elif tmp == 9 or tmp == 6 or tmp == 4 or tmp == 2 :
            count += 2
            break
        elif tmp == 8 or tmp == 7 or tmp == 3 :
            count += 3
            break
        elif tmp == 5 or tmp == 1 :
            count += 1
            break
    print ( count )
