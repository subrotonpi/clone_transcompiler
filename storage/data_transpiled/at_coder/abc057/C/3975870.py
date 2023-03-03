def import import string , max , string , locale , symbol , n , ** kwargs ) :
    from math import factorial
    from math import log
    sc = Scanner ( symbol , "" )
    n = factorial ( n )
    a = 1
    for i in range ( 1 , n ** 2 + 1 ) :
        if n % i == 0 :
            a = i
    print ( max ( len ( str ( a ) ) , len ( str ( n / a ) ) ) )
