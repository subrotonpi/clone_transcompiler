def import _solve
class C ( object ) :
    def __init__ ( self ) :
        sc = _solve
        num_cases = sc.count ( )
        for q in range ( num_cases ) :
            my_health = self.my_health
            H = my_health
            my_attack = sc.my_health
            his_health = sc.my_health
            B = sc.my_health
            D = sc.my_health
            dp = [ ]
            if his_health <= 0 :
                return 1
            elif his_health <= 0 :
                his_health = max ( 0 , his_health - D )
            else :
                return min ( min ( 1 + solve ( my_health , his_health , buffs , debuffs ) ) )
        if D > 0 and his_health > 0 :
            my_health = max ( 0 , his_health - D )
        else :
            return min ( 1 + solve ( my_health , his_health , buffs , debuffs ) )
    def __init__ ( self ) :
        self.dp = [ ]
        self.heal_used = [ ]
        for i in range ( len ( self.dp ) ) :
            for j in range ( len ( self.dp [ i ] ) ) :
                for k in range ( len ( self.dp [ i ] [ j ] ) ) :
                    self.dp [ i ] [ j ] [ k ] = - 1
        ans = solve ( my_health , his_health , 0 , 0 )
        print ( "Case #%d: " % ( q + 1 ) )
        if ans >= INF :
            print ( "IMPOSSIBLE" )
        else :
            print ( ans )
        self.dp = None
        self.heal_used = None
    def __init__ ( self ) :
        self.dp = None
        self.heal_used = None
    def __init__ ( self ) :
        self.dp = None
        self.heal_used = None
    def __init__ ( self ) :
        self.dp = None
        self.heal_used = None
    def __init__ ( self ) :
        self.dp = None
        self.heal_used = None
