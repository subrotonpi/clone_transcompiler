def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.S = __main__.S
    def __str__ ( self ) :
        return ""
    def __init__ ( self ) :
        self.S = __main__.S
    def __main__ ( self ) :
        cnt , ans = 0 , 0
        for s in self.S :
            if s in [ "A" , "T" , "G" , "C" ] :
                cnt += 1
            else :
                ans = max ( cnt , ans )
                cnt = 0
        ans = max ( cnt , ans )
        print ( ans )
