def main ( ) :
    import sys
    from collections import deque
    sc = raw_input ( )
    n , k , q = map ( int , sc.split ( ) )
    a = [ int ( i ) for i in sc.split ( ) ]
    ans = int ( 1e9 )
    for x in a :
        cnt = 0
        que = deque ( )
        ya = deque ( )
        for i in range ( n ) :
            que.append ( a [ i ] )
            if a [ i ] < x :
                que.clear ( )
            if k <= len ( que ) :
                cnt += 1
                ya.append ( que.popleft ( ) )
        if q <= cnt :
            y = 0
            for i in range ( q ) :
                y = ya.popleft ( )
            ans = min ( ans , y - x )
    print ( ans )
