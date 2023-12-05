def round2 ( ) :
    import random
    MOD = 1000000007L
    def calc ( r , may3 , mayother , mcm ) :
        ret = table [ r ] [ may3 ] [ mayother ] [ mcm ]
        if ret != - 1 :
            return ret
        if r == 0 :
            return table [ r ] [ may3 ] [ mayother ] [ mcm ]
        ret = 0
        if r >= 2 and may3 == 1 :
            ret += calc ( r - 2 , 0 , 1 , mcm )
            ret %= MOD
        if r >= 1 and mayother == 1 :
            ret += calc ( r - 1 , 1 , 0 , mcm )
        if r >= 2 and mayother == 1 :
            for period in range ( 3 , 7 , 3 ) :
                if C % period == 0 :
                    gcd = gcd ( period , mcm )
                    nmcm = period / gcd * mcm
                    val = calc ( r - 2 , 1 , 0 , int ( nmcm ) )
                    ret += gcd * val
                    ret %= MOD
            if r >= 3 and mayother == 1 and C % 4 == 0 :
                gcd = gcd ( 4 , mcm )
                nmcm = 4 / gcd * mcm
                val = calc ( r - 3 , 1 , 0 , int ( nmcm ) )
                ret += gcd * val
                ret %= MOD
            return table [ r ] [ may3 ] [ mayother ] [ mcm ]
        return table [ r ] [ may3 ] [ mayother ] [ mcm ]
    def gcd ( a , b ) :
        return b or a
    def main ( ) :
        with open ( '/proc/loop' , 'r' ) as f :
            cases = random.randint ( 1 , 5 )
            for caze in range ( 1 , cases + 1 ) :
                R = random.randint ( 1 , 13 )
                C = random.randint ( 1 , 13 )
                table = [ [ [ ( ( ( 1 , 2 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 , 3 ,