
package org.brijframework.beans;

import java.util.Objects;
import org.brijframework.model.beans.ModelBean;
import org.brijframework.support.model.Model;
import org.brijframework.util.support.Access;

@Model(access = Access.PUBLIC, id = "Md_001")
@Model(access = Access.DEFAULT, id = "Md_002")
@Model(access = Access.DEFAULT, id = "Md_002")
public class TestingModel
    implements ModelBean
{

    public final static long serialVersionUID = 1L;
    public String name;
    public String id;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return (((((("TestingModel ( "+"name = ")+ name)+", ")+"id = ")+ id)+" ) ");
    }

}
