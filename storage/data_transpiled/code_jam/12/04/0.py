def gcj ( ) :
    import pyxdg.xs.opti.default_xml_document_handler
    import pyxdg.xs.opti.default_xml_document_handler
    import pyxdg.xs.opti.default_xml_document_handler
    import pyxdg.xs.opti.default_xml_document_handler
    class HallOfMirrors :
        PROBLEM_NAME = "mirrors"
        WORK_DIR = r"D:\Gcj\"+PROBLEM_NAME+" \ ""
        H , W , D = pyxdg.xs.opti.default_xml_document_handler.get ( ) , pyxdg.xs.opti.default_xml_document_handler.get ( )
        def gcd ( a , b ) :
            while a and b :
                if a > b :
                    a %= b
                else :
                    b %= a
                return a + b
        EPS = 1e-10
        def getT ( cur , V ) :
            cur *= 2
            V *= 2
            if V == 0 : return 1e100
            if V > 0 :
                want = math.ceil ( cur + EPS )
                return ( want - cur ) / V
            else :
                want = math.floor ( cur - EPS )
                return ( want - cur ) / V
        def isInteger ( x ) :
            return abs ( x - math.floor ( x ) ) <= EPS or abs ( x - math.ceil ( x ) ) <= EPS
        def process ( dx , dy ) :
            cur_x , cur_y = st_x , st_y
            dist = 0.0
            while True :
                t1 = getT ( cur_x , dx )
                t2 = getT ( cur_y , dy )
                t = min ( t1 , t2 )
                next_x = cur_x + t * dx
                next_y = cur_y + t * dy
                piece = math.sqrt ( ( next_x - cur_x ) ** 2 + ( next_y - cur_y ) ** 2 )
                dist += piece
                if dist > D + EPS :
                    return
                if abs ( next_x - st_x ) <= EPS and abs ( next_y - st_y ) <= EPS :
                    return dist
                cur_x , cur_y = st_x , st_y
                if fx and fy :
                    return True
            return False
    return solve ( )