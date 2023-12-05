def main ( ) :
    from math import ceil
    from random import randint
    from random import choice
    class Main ( object ) :
        def __init__ ( self ) :
            self.__init__ ( )
    p10 = [ 0 ] * 19
    def run ( self ) :
        p10 [ 0 ] = 1
        for i in range ( 1 , len ( p10 ) ) :
            p10 [ i ] = p10 [ i - 1 ] * 10
        with open ( '/dev/null' , 'r' ) as f :
            print ( calc ( f.read ( ) ) )
    def calc ( d ) :
        ans = 0
        for i in range ( 1 , 19 ) :
            ans += solve ( d , i )
        return ans
    def solve ( d , args ) :
        comb = 1
        f = True
        while args :
            x = - 999999
            update = False
            if args [ 0 ] != 1 :
                for i in range ( - 9 , 9 ) :
                    if d % 10 == i * ( p10 [ - 1 ] - 1 ) % 10 and abs ( d - i * ( p10 [ - 1 ] - 1 ) ) <= p10 [ - 1 ] - 1 :
                        x = i
                        if update :
                            raise AssertionError
                        update = True
            else :
                if d == 0 :
                    return comb * ( 9 if f else 10 )
                else :
                    return 0
            if not update :
                return 0
            d -= x * ( p10 [ - 1 ] - 1 )
            cnt = 0
            for i in range ( 0 , 9 ) :
                if f and i == 0 :
                    continue
                if i + x >= 0 and i + x <= 9 :
                    cnt += 1
            comb *= cnt
            f = False
            args [ 0 ] -= 2
            if d % 10 != 0 :
                raise AssertionError
            if args [ 0 ] :
                d /= 10
        if d != 0 :
            return 0
        else :
            return comb
    def tr ( * args ) :
        print ( sum ( args ) )
