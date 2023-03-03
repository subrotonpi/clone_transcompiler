def import __main__
class Main ( object ) :
    def __init__ ( self ) :
        self.ai , self.ao , self.at , self.aj , self.al , self.as , self.az = __main__ ( )
    ai , ao , at , aj , self.al , self.as , self.az = __main__ ( )
    ans = 0
    ans = max ( ans , ai / 2 ** 2 + ao + aj / 2 ** 2 + al / 2 ** 2 )
    if ai and aj and al :
        ans = max ( ans , 3 + ( ai - 1 ) / 2 ** 2 + ao + ( aj - 1 ) / 2 ** 2 + ( al - 1 ) / 2 ** 2 )
    print ( ans )
