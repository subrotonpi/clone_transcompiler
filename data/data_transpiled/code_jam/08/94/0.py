def _ _ main _ _ ( ) :
    from pysal.core.problem import ProblemD
    class ProblemD ( object ) :
        def calc_dst ( map , stx , sty ) :
            N , M = map.shape
            if map [ 0 ] [ 0 ] == 'T' :
                tx2 = i
                ty2 = j
            if tx2 == - 1 and ty2 == - 1 :
                dst1 = calc_dst ( map , tx1 , ty1 )
                ans = [ ]
                for i in range ( N ) :
                    if map [ i ] [ j ] < minValue and not used [ i ] [ j ] :
                        minValue = i
                for j in range ( N ) :
                    if map [ i ] [ j ] != '.' :
                        ans += dst1 [ i ] [ j ]
                pw.write ( ans )
                continue
            dst1 = calc_dst ( map , tx2 , ty2 )
            ans = [ ]
            for i in range ( N ) :
                if map [ i ] [ j ] != '.' :
                    ans += [ ]
            if minX == tx2 and minY == ty2 :
                break
        dx , qy = [ - 1 , 1 , 0 ]
        for i in range ( N ) :
            if minX + dx [ i ] >= 0 and minX + dx [ i ] < N and minY + dy [ i ] >= 0 and minY + dy [ i ] < M and map [ minX + dx [ i ] ] [ minY + dy [ i ] ] != '.' and cost [ minX + dx [ i ] ] [ minY + dy [ i ] ] > minValue + cost [ minX + dx [ i ] ] [ minY + dy [ i ] ] ]
        res = [ ]
        for i in range ( N ) :
            if map [ i ] [ j ] == '.' :
                qx , qy = [ ]
                for j in range ( N ) :
                    map [ i ] = sc.next ( )
        return res
    def do_main ( ) :
        sc = open ( 'input.txt' , 'r' )
        pw = open ( 'output.txt' , 'w' )
        casecnt = sc.count ( )
        for casenum in range ( 1 ,