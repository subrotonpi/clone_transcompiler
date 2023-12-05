def _solve_2 ( n , a , x ) :
    from numpy import array
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    from scipy.optimize import minimize
    N = sum ( [ x [ i ] for i in range ( 1 , n + 1 ) if i <= n ] )
    A = sum ( [ x [ i ] for i in range ( 1 , n + 1 ) if i <= n ] )
    x = array ( [ x [ i ] for i in range ( 1 , n + 1 ) if i <= n ] )
    print ( minimize ( n , A , x ) )
    def solve ( n , a , x ) :
        y = [ i - a for i in range ( 1 , n + 1 ) if i <= n ]
        return brute ( n - 1 , 0 , y )
    def brute ( ( i , n , n , y ) , x ) :
        if i < 0 :
            return 0
        return ( n + y [ i ] == 0 ) + brute ( n - 1 , n , y ) + brute ( n - 1 , n + y [ i ] , y )
    def solve3 ( n , a , x ) :
        X = max ( [ a , x [ i ] ] )
        dp = zeros ( ( n + 1 , n + 1 , n * X + 1 ) )
        dp [ 0 , 0 , 0 ] = 1
        for i in range ( 1 , n + 1 ) :
            for j in range ( 0 , n + 1 ) :
                for k in range ( 0 , n * X ) :
                    if k - x [ i - 1 ] >= 0 and j - 1 >= 0 :
                        dp [ i , j , k ] = dp [ i - 1 , j , k ] + dp [ i - 1 , j - 1 , k - x [ i - 1 ] ]
                    else :
                        dp [ i , j , k ] = dp [ i -