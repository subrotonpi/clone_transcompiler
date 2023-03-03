def import _union
class Main ( object ) :
    def __init__ ( self ) :
        sc = _union ( )
        N = sc.count
        S1 = sc.get ( 'N' )
        S2 = sc.get ( 'S2' )
        s1 = S1.split ( ' ' )
        s2 = S2.split ( ' ' )
        uf = _union ( 10 + 'Z' - 'A' + 1 )
        count = { }
        for i in range ( N ) :
            if s1 [ i ] >= 'A' and s1 [ i ] <= 'Z' and count [ s1 [ i ] - 'A' ] == 0 :
                count [ s1 [ i ] - 'A' ] = 10 - ( i == 0 )
            if s2 [ i ] >= 'A' and s2 [ i ] <= 'Z' and count [ s2 [ i ] - 'A' ] == 0 :
                count [ s2 [ i ] - 'A' ] = 10 - ( i == 0 )
            if s1 [ i ] >= '0' and s1 [ i ] <= '9' :
                i1 = s1 [ i ] - '0'
            else :
                i1 = s1 [ i ] - 'A' + 10
            if s2 [ i ] >= '0' and s2 [ i ] <= '9' :
                i2 = s2 [ i ] - '0'
            else :
                i2 = s2 [ i ] - 'A' + 10
            uf ( i1 , i2 )
        for i in range ( 10 ) :
            for j in range ( 10 , 10 + 'Z' - 'A' + 1 ) :
                if uf ( i , j ) :
                    count [ j - 10 ] = 1
    self.ret = 1
    for i in range ( 10 , 'Z' - 'A' + 1 ) :
        if count [ i - 10 ] != 0 :
            flag = True
            for j in range ( 10 , i ) :
                if uf ( i , j ) :
                    flag = False
            if flag :
                ret *= count [ i - 10 ]
    return Main
