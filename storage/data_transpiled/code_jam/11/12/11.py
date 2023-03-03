def import _KillerWord
class KillerWord ( object ) :
    def __init__ ( self , arg ) :
        sc = _KillerWord
        tc = sc.count ( )
        for ctc in range ( 1 , tc + 1 ) :
            print ( "Case #%d:" % ctc )
            n = sc.count ( )
            m = sc.count ( )
            dict = { }
            for i in range ( 26 ) :
                dict [ i ] = _KillerWord ( sc.next ( ) )
        for i in range ( 26 ) :
            lst = sc.next ( )
            for i , pow in enumerate ( lst ) :
                lst [ i ] = sig [ i ] - 'a'
        for i in range ( 26 ) :
            lst = sc.next ( )
            for w in dict :
                w.score = 0
                w.node = None
                w.path = lst
            for i in range ( 1 , 10 ) :
                dc = [ w for w in dict if w.len == i ]
                if len ( dc ) <= 1 :
                    continue
                root = KillerWord ( )
                root.wc = len ( dc )
                for w in dc :
                    cur = root
                    for x in w.path :
                        next = cur.map.get ( x )
                        if not next :
                            next = KillerWord ( )
                            next.parent = cur
                            cur.map [ x ] = next
                        cur = next
                    cur.wc += 1
                cur.word = w
                w.node = cur
            for w in dc :
                for parent in cur.map.values ( ) :
                    if not parent :
                        break
                    if parent.wc != 1 :
                        break
                    w.node = parent
                    parent.word = w
                    parent.map = { }
    q = [ ]
    while True :
        cur = q.pop ( )
        while len ( cur.map ) == 1 :
            child = cur.map.get ( 0 )
            if not child :
                break
            cur.word = child.word
            cur.map = child.map
            cur.wc = child.wc
