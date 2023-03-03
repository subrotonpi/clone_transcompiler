def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = 0
        self.ans = sys.stdin.read ( )
    def main ( self ) :
        self.ans = sys.stdin.read ( )
        a = self.ans.split ( '' )
        count1 = 0
        count2 = 0
        count3 = 0
        count4 = 0
        for val in a :
            if int ( val ) == 1 :
                count1 += 1
            elif val == 2 :
                count2 += 1
            elif val == 3 :
                count3 += 1
            elif val == 4 :
                count4 += 1
    self.max = None
    self.min = None
    if count1 > count2 :
        self.max = count1
        self.min = count2
    else :
        self.max = count2
        self.min = count1
    if count3 > count4 :
        if self.count3 > self.max :
            self.max = self.count3
        if self.min > self.count4 :
            self.min = self.count4
    else :
        if self.count4 > self.max :
            self.max = self.count4
        if self.min > self.count3 :
            self.min = self.count3
    print ( self.max , self.min )
