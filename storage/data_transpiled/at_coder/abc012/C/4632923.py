def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from itertools import chain
    N = len ( chain ( [ 1 , 2 , 3 , 5 , 7 ] , repeat = repeat ) )
    sum = 0
    for i in range ( 1 , 9 ) :
        for j in range ( 1 , 9 ) :
            sum += i * j
    rest = sum - N
    factors_list = [ 1 ]
    index = 1
    tmp = rest
    for i in [ 2 , 3 , 5 , 7 ] :
        while tmp % i == 0 :
            tmp /= i
            factors_list.append ( i )
            index += 1
    factors = chain ( * factors_list )
    first = defaultdict ( list )
    while True :
        for i in range ( len ( factors ) ) :
            num = 1
            for j in range ( 0 , i ) :
                if factors [ j ] != 0 :
                    num *= factors [ j ]
            if num <= 9 and rest // num <= 9 :
                first [ num ].append ( rest // num )
        for key , val in first.items ( ) :
            print ( key , 'x ' , val )
    def next_permutation ( a ) :
        for i in range ( len ( a ) - 1 , 0 , - 1 ) :
            if a [ i - 1 ] < a [ i ] :
                swap_index = find ( a [ i - 1 ] , a [ i : - 1 ] )
                temp = a [ swap_index ]
                a [ swap_index ] = a [ i - 1 ]
                a [ i - 1 ] = temp
                yield a [ i : ]
                return True
        return False
    def find ( dest , a , s , e ) :
        if s == e :
            return s
        m = ( s + e + 1 ) // 2
        return find ( dest , a , s , m - 1 ) if a [ m ] <= dest else find ( dest , a , m , e )
