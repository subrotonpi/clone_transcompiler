def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.randint ( 1 , 10000 )
        m = sc.randint ( 1 , 10000 )
        P = sc.randint ( 1 , 10000 )
        Q = sc.randint ( 1 , 10000 )
        R = sc.randint ( 1 , 10000 )
        z = [ [ ] for i in range ( n ) ]
        for x , y in zip ( range ( m ) , range ( n ) ) :
            z [ x - 1 ] [ y - 1 ] = sc.randint ( 1 , 10000 )
    boy_can = set ( )
    cal_can ( boy_can , m , Q )
    ans = 0
    for w in boy_can :
        cur = w
        boys = [ ]
        for i in range ( 19 ) :
            if cur & ( 1 << i ) :
                boys.append ( i )
        sum = 0
        pq = [ ]
        for girl in range ( n ) :
            now = 0
            for boy in boys :
                now += z [ girl ] [ boy ]
            pq.append ( now )
            sum += now
            if len ( pq ) > P :
                sum -= pq.pop ( )
        ans = max ( ans , sum )
    print ( ans )
    def cal_can ( boy_can , m , Q ) :
        for i in range ( 1 , ( 1 << m ) - 1 ) :
            if nb_one ( i ) == Q :
                boy_can.add ( i )
    def nb_one ( s ) :
        cnt = 0
        while s > 0 :
            if s % 2 == 1 :
                cnt += 1
            s = s // 2
        return cnt
