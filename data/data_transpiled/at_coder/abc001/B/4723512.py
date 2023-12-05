def main ( ) :
    import sys
    try :
        with open ( '../../metre' ) as f :
            metre = float ( f.read ( ) )
            vv = vv ( metre )
            if vv < 10 :
                print ( '0' * int ( vv ) )
            else :
                print ( '%d' % int ( vv ) )
    except :
        return 0
    def vv ( metre ) :
        km = metre / 1_000
        if km < 0.1 :
            return 0
        elif km <= 5 :
            return km * 10
        elif km <= 30 :
            return km + 50
        elif km <= 70 :
            return ( km - 30 ) / 5 + 80
        else :
            return 89
    return vv
