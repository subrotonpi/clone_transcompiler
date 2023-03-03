def import _solve
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.a = [ ]
    def solve ( self , include , i ) :
        if i == self.n :
            res = 0
            for j in range ( self.n ) :
                if self.include % 2 == 1 :
                    res += 1
                self.include /= 2
            return res
        flag = True
        tmp = self.include
        for j in range ( self.i ) :
            if tmp % 2 == 1 and not self.a [ j ] [ i ] :
                flag = False
                break
            self.tmp /= 2
        if flag :
            return max ( self.solve ( self.include + int ( pow ( 2 , i ) ) , self.i + 1 ) , self.a )
        else :
            return self.solve ( self.include , self.i + 1 )
    def solve ( self , i ) :
        self.n = i
        self.m = i
        self.a = [ ]
        for i in range ( self.m ) :
            x = self.n - 1
            y = self.n - 1
            self.a.append ( [ x , y ] )
        print ( self.solve ( 0 , 0 ) )
        self.a = [ ]
        return self.solve ( 0 , 0 )
