def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.H , self.W = self.sys.maxsize , self.sys.maxsize
        self.h , self.w = self.sys.maxsize , self.sys.maxsize
        self.x = ( - 1000 ) * ( self.h * self.w - 1 ) - 1
    ans = [ '' for _ in range ( self.H ) ]
    sum = 0
    for i in range ( 1 , self.H + 1 ) :
        s = [ ]
        for j in range ( 1 , self.W + 1 ) :
            if i % self.h == 0 and j % self.w == 0 :
                s.append ( x )
                s.append ( '' )
                sum += x
            else :
                s.append ( 1000 )
                s.append ( '' )
                sum += 1000
        s = ''.join ( s )
        ans.append ( ''.join ( s ) )
    if sum <= 0 :
        print ( 'No' )
    else :
        print ( 'Yes' )
        for i in range ( self.H ) :
            print ( ans [ i ] )
    return
