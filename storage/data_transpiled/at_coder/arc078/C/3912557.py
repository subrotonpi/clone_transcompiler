def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            kleft , kright = 1 , 10
            while kleft < kright :
                kmin = ( kleft + kright ) / 2 + ( kleft == ( kright - 1 ) )
                v = 1
                for i in range ( kmin - 1 ) :
                    v *= 10
                self.send ( "? " + str ( v ) )
                respond = sc.recv ( )
                if respond == "Y" :
                    kleft = kmin
                else :
                    kright = kmin - 1
            if kleft == 10 :
                dam = 2
                for i in range ( 10 ) :
                    self.send ( "? " + str ( dam ) )
                    if sc.recv ( ) == "Y" :
                        self.send ( "! " + str ( dam / 2 ) )
                        return
                    dam *= 10
    keta = kleft
    if keta == 1 :
        sol ( sc , 1 , 0 )
        return
    sleft , sright = 1 , 9
    while sleft < sright :
        smid = ( sleft + sright ) / 2 + ( sleft == ( sright - 1 ) )
        v = smid
        for i in range ( keta - 2 ) :
            v *= 10
        self.send ( "? " + str ( v ) )
        respond = sc.recv ( )
        if respond == "Y" :
            sleft = smid
        else :
            sright = smid - 1
    oom = sleft
    for i in range ( keta - 1 ) :
        oom *= 10
        sol ( sc , keta - 1 , oom )
