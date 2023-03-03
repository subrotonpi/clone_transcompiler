def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.sq = int ( math.sqrt ( float ( self.N ) ) )
        if ( self.A + self.B > self.N + 1 or ( self.A < sq and B < sq ) ) :
            print ( - 1 )
        elif self.A + self.B == self.N + 1 :
            for i in range ( self.B , self.N + 1 ) :
                print ( i , end = ' ' )
            for i in range ( self.B - 1 , 1 , - 1 ) :
                print ( i , end = ' ' )
            print ( )
        else :
            tempA = ( self.N // B ) + ( self.N % B != 0 )
            hidari = 0
            while tempA + hidari != A :
                hidari += 1
                if hidari > self.N :
                    print ( - 1 )
                    return
                if ( self.N - hidari ) % self.B == 0 :
                    tempA -= 1
        nowN = self.N - self.hidari
        for i in range ( 1 , self.hidari + 1 ) :
            print ( i , end = ' ' )
        for i in range ( 1 , nowN // B + 1 ) :
            for j in range ( i * B , ( i - 1 ) * B , - 1 ) :
                print ( ( j + self.hidari ) , end = ' ' )
        for j in range ( nowN , self.B * ( self.nowN // B ) , - 1 ) :
            print ( ( j + self.hidari ) , end = ' ' )
        print ( )
    return
