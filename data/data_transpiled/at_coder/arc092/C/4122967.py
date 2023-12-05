def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
    def main ( self ) :
        self.a = [ ]
        self.all = True
        for i in range ( self.n ) :
            self.a.append ( i )
            if self.a [ i ] >= 0 :
                self.all = False
        if self.all :
            ind = 0
            for i in range ( self.n ) :
                if self.a [ i ] > self.a [ ind ] :
                    ind = i
            print ( self.a [ ind ] )
            print ( self.n - 1 )
            for i in range ( ind ) :
                print ( 1 )
            for i in range ( ind + 1 , self.n ) :
                print ( self.n - i + 1 )
            return
    os , es = 0 , 0
    stack = [ ]
    size = 0
    for i in range ( self.n ) :
        if self.a [ i ] < 0 :
            continue
        if i % 2 == 0 :
            es += self.a [ i ]
        else :
            os += self.a [ i ]
    print ( max ( os , es ) )
    ta = [ ]
    p = 1 if os > es else 0
    count = 0
    for i in range ( self.n ) :
        if i % 2 != p or self.a [ i ] >= 0 :
            continue
        stack.append ( ( i - count , ) )
        ta [ i ] += 1
        if ( i - count ) == 0 or i == ( self.n - 1 ) :
            count += 1
        else :
            count += 2
            ta [ i ] *= 2
    count = 0
    for i in range ( self.n ) :
        count += ta [ i ]
        if i % 2 == p :
            continue
        if ( i > 0 ) and ( ta [ i - 1 ] > 1 ) :
            continue
        stack.append ( i - count )
        if ( i - count ) == 0 or i == ( self.n - 1 ) :
            count += 1
        else :
        INDENT