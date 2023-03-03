def _import ( ) :
    from sympy.combinatorics.permutations import Permutation
    from sympy.combinatorics.permutations import permutations
    from sympy.combinatorics.permutations import factorial
    from sympy.combinatorics.permutations import permutations
    n , p = symbols ( 'n p' )
    M0 , M1 = 0 , 0
    for i in range ( n ) :
        if i % 2 == 0 :
            M0 += 1
        else :
            M1 += 1
    ans = 0
    temp = 0
    if p == 0 :
        for i in range ( 0 , M0 ) :
            ans += comb ( M0 , i )
        i = 0
        while i * 2 <= M1 :
            temp += comb ( M1 , i * 2 )
            i += 1
    else :
        i = 0
        while i * 2 + 1 <= M1 :
            ans += comb ( M1 , 2 * i + 1 )
            i += 1
        for j in range ( 0 , M0 ) :
            temp += comb ( M0 , j )
    out ( ans * temp )
    def comb ( a , b ) :
        if b == 0 : return 1
        return comb ( a - 1 , b - 1 ) * a / b
    return sum ( [ a * b for a in range ( n ) ] )
