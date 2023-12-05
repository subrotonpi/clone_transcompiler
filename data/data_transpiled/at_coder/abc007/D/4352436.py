def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = int ( self.a )
        self.b = int ( self.b )
        self.dp_clear ( )
        countb = count4and9 ( str ( b ) , 1 )
        self.dp_clear ( )
        counta = count4and9 ( str ( a - 1 ) , 1 )
        print ( ( b - a + 1 ) - ( countb - counta ) )
    def dp_clear ( ) :
        for i in range ( len ( self.dp ) ) :
            for j in range ( len ( self.dp [ i ] ) ) :
                self.dp [ i ] [ j ] = - 1
    def count_4and9 ( string_b , tight ) :
        topb = int ( string_b [ 0 ] )
        count = 0
        if self.dp [ - 1 ] [ tight ] != - 1 :
            return self.dp [ - 1 ] [ tight ]
        else :
            if len ( string_b ) == 1 :
                for i in range ( 0 , ( topb if tight == 1 else 9 ) ) :
                    if i == 4 | i == 9 :
                        continue
                    count += 1
            else :
                nextb = string_b [ 1 : ]
                for i in range ( 0 , ( topb if tight == 1 else 9 ) ) :
                    if i == 4 | i == 9 :
                        continue
                    else :
                        if tight == 1 & topb == i :
                            count = count + count_4and9 ( nextb , 1 )
                        else :
                            count = count + count_4and9 ( nextb , 0 )
            self.dp [ - 1 ] [ tight ] = count
            return count
class Pair ( object ) :
    def __init__ ( self , a , b ) :
        self.a = a
        self.b = b
    def __eq__ ( self , other ) :
        if isinstance ( other , Pair ) :
            self.a = other.a
        return self.a == other.b
return Main
