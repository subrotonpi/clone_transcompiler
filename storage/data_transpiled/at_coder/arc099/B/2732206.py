def import import string
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    K = int ( sys.argv [ 1 ] )
    ans = 0
    ans1 , ans2 , s1 , s2 = map ( int , string.split ( str ( ans ) ) )
    add = 1
    count = 0
    flag = True
    times = 9
    while count < K :
        ans1 = ans + add
        s1 = 0
        a1 = str ( ans1 )
        for i in a1 :
            s1 += int ( str ( i ) )
        ans2 = ans1 + add
        s2 = 0
        a2 = str ( ans2 )
        for i in a2 :
            s2 += int ( str ( i ) )
        if ans2 * s1 - ans1 * s2 < 0 :
            add *= 10
            flag = True
            continue
        if flag :
            times = 9
        else :
            times = 10
        a = str ( ans + add )
        for i in range ( times ) :
            ans += add
            ai = str ( ans )
            if a != ai :
                ans -= add
                break
            print ( ans )
            count += 1
            if count >= K :
                break
        flag = False
