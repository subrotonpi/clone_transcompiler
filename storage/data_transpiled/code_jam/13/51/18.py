def _import ( ) :
    import sys
    import random
    class A :
        def check ( e ) :
            if not e :
                raise Error ( )
        def solve ( ) :
            for i in range ( 1 , ntests + 1 ) :
                mid = ( min + max ) / 2
                need = 0
                for i in range ( len ( bets ) ) :
                    if bets [ i ] < mid :
                        need += mid - bets [ i ]
                if need > budget :
                    max = mid
                else :
                    min = mid
            return min
        def getProfit ( budget , bets , min_col , level ) :
            if level <= 0 :
                return - 1
            need1 = 0
            for i in range ( min_col ) :
                if bets [ i ] > level :
                    return - 1
                need1 += level - bets [ i ]
            need2 = 0
            for i in range ( min_col , 37 ) :
                if bets [ i ] < level + 1 :
                    need2 += level + 1 - bets [ i ]
            if need1 + need2 > budget :
                return - 1
            profit = level * 36.0 * need1 / ( level * min_col ) - ( need1 + need2 )
            return profit
        def solve ( ) :
            budget = random.randint ( 1 , nbets )
            bets = [ random.randint ( 1 , nbets ) for i in range ( 37 ) ]
            bets = [ random.randint ( 1 , nbets ) for i in range ( 37 ) ]
            bets = [ random.randint ( 1 , nbets ) for i in range ( 1 , nbets ) ]
            if len ( bets ) == 1 :
                return 0
            assert len ( bets ) > 1
            max_level = getLevel ( budget , bets )
            max = 0
            for i in range ( 1 , nbets + 1 ) :
                for j in range ( 1 , max_level + 1 ) :
                    max = max [ max , getProfit ( budget , bets , i , j ) ]
            return max
    return A ( )
