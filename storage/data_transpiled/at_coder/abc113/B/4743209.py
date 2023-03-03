def main ( ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    n , t , a = solve ( )
    h_list = zeros ( n )
    num = 0
    tem , dif , mindif = 0 , zeros ( n ) , zeros ( n ) , zeros ( n )
    for i in range ( n ) :
        h_list [ i ] = solve ( )
        tem = t - h_list [ i ] * 0.006
        if tem >= a :
            dif = tem - a
        else :
            dif = a - tem
        if mindif >= dif :
            mindif = dif
            num = i + 1
    print ( num )
    solve ( )
