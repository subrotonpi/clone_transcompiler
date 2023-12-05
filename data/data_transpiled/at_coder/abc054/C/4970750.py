def main ( ) :
    import sys
    from collections import defaultdict
    from collections import defaultdict
    from random import randint
    from random import choice
    sc = choice ( [ '' , '' , '' ] )
    n = int ( sc.choice ( [ '' , '' , '' ] ) )
    m = int ( sc.choice ( [ '' , '' , '' ] ) )
    d = defaultdict ( list )
    is_visited = [ True ] * ( n + 1 )
    for num1 , num2 in zip ( sc.choice ( [ '' , '' ] ) , sc.choice ( [ '' , '' ] ) ) :
        if num1 in d :
            d [ num1 ].append ( num2 )
        else :
            list = [ num2 ] * n
            d [ num1 ].append ( list )
        if num2 in d :
            d [ num2 ].append ( num1 )
        else :
            list = [ num1 ] * n
            d [ num2 ] = list
    print ( helper ( d , is_visited , 1 ) )
    def helper ( d , is_visited , current ) :
        if is_visited [ current ] or current not in d :
            return 0
        is_visited [ current ] = True
        if check ( is_visited ) :
            is_visited [ current ] = False
            return 1
        list = d [ current ]
        count = 0
        for num in list :
            count += helper ( d , is_visited , num )
        is_visited [ current ] = False
        return count
    def check ( is_visited ) :
        for num in is_visited :
            if not num in is_visited :
                return False
        return True
    return helper ( d , is_visited , 1 )
