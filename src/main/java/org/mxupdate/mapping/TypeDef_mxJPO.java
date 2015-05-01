/*
 *  This file is part of MxUpdate <http://www.mxupdate.org>.
 *
 *  MxUpdate is a deployment tool for a PLM platform to handle
 *  administration objects as single update files (configuration item).
 *
 *  Copyright (C) 2008-2016 The MxUpdate Team - All Rights Reserved
 *
 *  You may use, distribute and modify MxUpdate under the terms of the
 *  MxUpdate license. You should have received a copy of the MxUpdate
 *  license with this file. If not, please write to <info@mxupdate.org>,
 *  or visit <www.mxupdate.org>.
 *
 */

package org.mxupdate.mapping;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;

import matrix.util.MatrixException;

import org.mxupdate.update.AbstractObject_mxJPO;
import org.mxupdate.update.util.MqlUtil_mxJPO;
import org.mxupdate.update.util.ParameterCache_mxJPO;

/**
 * Enumeration for administration type definitions.
 *
 * @author The MxUpdate Team
 */
public final class TypeDef_mxJPO
        extends AbstractValue_mxJPO
        implements Comparable<TypeDef_mxJPO>
{
    /**
     * MQL command to list all MxUpdate JPOs.
     *
     * @see #defineJPOClass(ParameterCache_mxJPO, Mapping_mxJPO, String)
     */
    private static final String MQL_LISTPROG = "list prog org.mxupdate.* select name classname dump '\t'";

    /**
     * Used prefix of admin type suffix.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #adminSuffix
     */
    private static final String PREFIX_ADMIN_SUFFIX = "AdminSuffix";

    /**
     * Used prefix of the admin type name.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #adminType
     */
    private static final String PREFIX_ADMIN_TYPE = "AdminType";

    /**
     * Used prefix of ignored attributes for business objects within the
     * property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busIgnoredAttributes
     */
    private static final String PREFIX_BUS_IGNOREATTRIBUTES = "BusIgnoreAttributes";

    /**
     * Used prefix of check exists definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busCheckExists
     */
    private static final String PREFIX_BUS_CHECKEXISTS = "BusCheckExists";

    /**
     * Used prefix of policy definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busPolicy
     */
    private static final String PREFIX_BUS_POLICY = "BusPolicy";

    /**
     * Used prefix of both relationship definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busRelsBoth
     */
    private static final String PREFIX_BUS_RELSBOTH = "BusRelsBoth";

    /**
     * Used prefix of from relationship definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busRelsFrom
     */
    private static final String PREFIX_BUS_RELSFROM = "BusRelsFrom";

    /**
     * Used prefix of to relationship definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busRelsTo
     */
    private static final String PREFIX_BUS_RELSTO = "BusRelsTo";

    /**
     * Used prefix of business type definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busType
     */
    private static final String PREFIX_BUS_TYPE = "BusType";

    /**
     * Used prefix of business type derived definitions within the property
     * file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busTypeDerived
     */
    private static final String PREFIX_BUS_TYPE_DERIVED = "BusTypeDerived";

    /**
     * Used prefix of vault definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #busVault
     */
    private static final String PREFIX_BUS_VAULT = "BusVault";

    /**
     * Used prefix of type definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #filePath
     */
    private static final String PREFIX_FILE_PATH = "FilePath";

    /**
     * Used prefix of file last matching definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #fileMatchLast
     */
    private static final String PREFIX_FILE_MATCHLAST = "FileMatchLast";

    /**
     * Used prefix of file prefix definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #filePrefix
     */
    private static final String PREFIX_FILE_PREFIX = "FilePrefix";

    /**
     * Used file suffix of file suffix definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #fileSuffix
     */
    private static final String PREFIX_FILE_SUFFIX = "FileSuffix";

    /**
     * Used file suffix of icon path definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #iconPath
     */
    private static final String PREFIX_ICONPATH = "Icon";

    /**
     * Used prefix of the JPO name.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #jpoClass
     */
    private static final String PREFIX_JPO = "JPO";

    /**
     * Used logging text of type definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #textLogging
     */
    private static final String PREFIX_TEXT_LOGGING = "TextLogging";

    /**
     * Used title of type definitions within the property file.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #textTitle
     */
    private static final String PREFIX_TEXT_TITLE = "TextTitle";

    /**
     * Used order number within update.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #orderNo
     */
    private static final String PREFIX_ORDERNO = "OrderNo";

    /** Defines the name of the admin type. */
    private String adminType;
    /** Defines the suffix of the admin type. */
    private String adminSuffix = "";

    /**
     * Must be checked if the business type exists?
     *
     * @see #isBusCheckExists
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private boolean busCheckExists = false;

    /**
     * Defines the list of attributes which are automatically ignored
     * within the update.
     *
     * @see #getMxBusIgnoredAttributes()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private Collection<String> busIgnoredAttributes;

    /**
     * Mapping between internal used type definitions and the MX policy
     * names.
     *
     * @see #getMxBusPolicy()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String busPolicy;

    /**
     * Defines the list of both relationships which must be evaluated to write
     * and run of update script.
     *
     * @see #getMxBusRelsBoth()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private Collection<String> busRelsBoth;

    /**
     * Defines the list of from relationships which must be evaluated to write
     * and run of update script.
     *
     * @see #getMxBusRelsFrom()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private Collection<String> busRelsFrom;

    /**
     * Defines the list of to relationships which must be evaluated to write
     * and run of update script.
     *
     * @see #getMxBusRelsTo()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private Collection<String> busRelsTo;

    /**
     * Mapping between internal used type definitions and the MX type
     * names.
     *
     * @see #getMxBusType()
     * @see #existsBusType(ParameterCache_mxJPO)
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String busType;

    /**
     * If set to <i>true</i> business objects are using types which are derived
     * from the defined {@link #busType business type}.
     *
     * @see #busType
     * @see #hasMxBusTypeDerived()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private boolean busTypeDerived = false;

    /**
     * Mapping between internal used type definitions and the MX vault
     * names.
     *
     * @see #getMxBusVault()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String busVault;

    /**
     * Must the matching files matched on last positions? E.g. required if no
     * {@link #filePrefix} and no {@link #fileSuffix} are defined.
     *
     * @see #isFileMatchLast()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private boolean fileMatchLast = false;

    /**
     * Mapping between internal used type definitions and the file paths.
     *
     * @see #getFilePath()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String filePath;

    /**
     * Mapping between internal used administration type definitions and the
     * file prefixes.
     *
     * @see #getFilePrefix()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String filePrefix;

    /**
     * Mapping between internal used administration type definitions and the
     * file suffixes.
     *
     * @see #getFileSuffix()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String fileSuffix;

    /**
     * Stores the path to the icon for the type definition.
     *
     * @see #getIconPath()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     * @see #PREFIX_ICONPATH
     */
    private String iconPath;

    /**
     * Stores the class implementing the MxUpdate functionality.
     *
     * @see #newTypeInstance(String)
     * @see #defineJPOClass(ParameterCache_mxJPO, Mapping_mxJPO, String)
     */
    private Class<? extends AbstractObject_mxJPO> jpoClass;

    /**
     * Order number used within update.
     *
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private int orderNo = Integer.MAX_VALUE;

    /**
     * Mapping between internal used administration type definitions and the
     * logging string.
     *
     * @see #getLogging()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String textLogging;

    /**
     * Mapping between internal used administration type definitions and the
     * titles.
     *
     * @see #getTitle()
     * @see #defineValue(ParameterCache_mxJPO, Mapping_mxJPO, String, String)
     */
    private String textTitle;

    /**
     * Defines the values of the type definition.
     *
     * @param _paramCache   parameter cache
     * @param _mapping      cache for all mapping
     * @param _key          key of the type definition (including the name of
     *                      type definition and the kind of the type definition
     *                      separated by a point)
     * @param _value        value of the related value
     * @throws Exception if the values could not be defined or the JPO names
     *                   could not be extracted
     * @see Mapping_mxJPO#getTypeDefMap()
     * @see #defineJPOClass(ParameterCache_mxJPO, Mapping_mxJPO, String)
     */
    protected static void defineValue(final ParameterCache_mxJPO _paramCache,
                                      final Mapping_mxJPO _mapping,
                                      final String _key,
                                      final String _value)
            throws Exception
    {
        final String enumName = _key.replaceAll("\\..*", "");
        final String key = _key.substring(enumName.length() + 1);

        TypeDef_mxJPO typeDef = _mapping.getTypeDefMap().get(enumName);
        if (typeDef == null)  {
            typeDef = new TypeDef_mxJPO(enumName);
            _mapping.getTypeDefMap().put(enumName, typeDef);
        }

        if (key.equals(TypeDef_mxJPO.PREFIX_ADMIN_SUFFIX))  {
            typeDef.adminSuffix = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_ADMIN_TYPE))  {
            typeDef.adminType = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_CHECKEXISTS))  {
            typeDef.busCheckExists = _value.equalsIgnoreCase("true");
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_IGNOREATTRIBUTES))  {
            typeDef.busIgnoredAttributes = Arrays.asList(_value.split(","));
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_RELSBOTH))  {
            typeDef.busRelsBoth = Arrays.asList(_value.split(","));
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_RELSFROM))  {
            typeDef.busRelsFrom = Arrays.asList(_value.split(","));
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_RELSTO))  {
            typeDef.busRelsTo = Arrays.asList(_value.split(","));
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_POLICY))  {
            typeDef.busPolicy = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_TYPE))  {
            typeDef.busType = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_TYPE_DERIVED))  {
            typeDef.busTypeDerived = Boolean.valueOf(_value);
        } else if (key.equals(TypeDef_mxJPO.PREFIX_BUS_VAULT))  {
            typeDef.busVault = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_FILE_MATCHLAST))  {
            typeDef.fileMatchLast = _value.equalsIgnoreCase("true");
        } else if (key.equals(TypeDef_mxJPO.PREFIX_FILE_PATH))  {
            typeDef.filePath = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_FILE_PREFIX))  {
            typeDef.filePrefix = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_FILE_SUFFIX))  {
            typeDef.fileSuffix = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_ICONPATH))  {
            typeDef.iconPath = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_JPO))  {
            typeDef.defineJPOClass(_paramCache, _mapping, _value);
        } else if (key.equals(TypeDef_mxJPO.PREFIX_ORDERNO))  {
            typeDef.orderNo = Integer.parseInt(_value);
        } else if (key.equals(TypeDef_mxJPO.PREFIX_TEXT_LOGGING))  {
            typeDef.textLogging = _value;
        } else if (key.equals(TypeDef_mxJPO.PREFIX_TEXT_TITLE))  {
            typeDef.textTitle = _value;
        } else  {
            typeDef.defineValues(key, _value);
        }
    }

    /**
     * The constructor is defined private so that a new instance could only
     * created within this class.
     *
     * @param _name     name of the type definition group
     */
    private TypeDef_mxJPO(final String _name)
    {
        super(_name);
    }

    /**
     * Defines the class for given JPO name.
     *
     * @param _paramCache   parameter cache
     * @param _mapping      cache mapping
     * @param _jpoName      name of searched JPO
     * @throws Exception if the list of MxUdpate JPOs could not evaluated or
     *                   if the related class could not be found
     * @see #MQL_LISTPROG
     * @see #jpoClass
     */
    @SuppressWarnings("unchecked")
    private void defineJPOClass(final ParameterCache_mxJPO _paramCache,
                                final Mapping_mxJPO _mapping,
                                final String _jpoName)
            throws Exception
    {
        if (_mapping.getTypeDefJPOsMap().isEmpty())  {
            final String tmp = MqlUtil_mxJPO.execMql(_paramCache, TypeDef_mxJPO.MQL_LISTPROG);
            for (final String line : tmp.split("\n"))  {
                final String[] arr = line.split("\t");
                if (arr.length > 1)  {
                    _mapping.getTypeDefJPOsMap().put(arr[0], arr[1]);
                }
            }
        }
        final String jpoClassName = _mapping.getTypeDefJPOsMap().get(_jpoName);
        if (jpoClassName == null)  {
            throw new Exception("unknown jpo class definition for " + _jpoName);
        }
        try
        {
            // directly in MX
            this.jpoClass = (Class<? extends AbstractObject_mxJPO>) Class.forName(jpoClassName);
        }
        catch (final ClassNotFoundException e)
        {
            // run separately
            this.jpoClass = (Class<? extends AbstractObject_mxJPO>) Class.forName(_jpoName + "_mxJPO");
        }
    }

    /**
     * Returns the related administration type fsufix used within MX. The
     * method returns only correct values if the initialize method was
     * called!
     *
     * @return MX suffix of the administration type definition
     * @see #adminSuffix
     */
    public String getMxAdminSuffix()
    {
        return this.adminSuffix;
    }

    /**
     * Returns the related administration type name used within MX. The
     * method returns only correct values if the initialize method was
     * called!
     *
     * @return MX name of the administration type definition
     * @see #adminType
     */
    public String getMxAdminName()
    {
        return this.adminType;
    }

    /**
     * Must be checked if the business type exists? The method returns only
     * correct values if the initialize method was called!
     *
     * @return <i>true</i> if a check must be done if the type exists;
     *         otherwise <i>false</i>
     * @see #busCheckExists
     */
    public boolean isBusCheckExists()
    {
        return this.busCheckExists;
    }

    /**
     * Checks if the business type defining this type definition exists.
     *
     * @param _paramCache   parameter cache with MX context
     * @return <i>true</i> if the business type exists; otherwise <i>false</i>
     * @throws MatrixException if the check failed
     */
    public boolean existsBusType(final ParameterCache_mxJPO _paramCache)
            throws MatrixException
    {
        final String tmp = MqlUtil_mxJPO.execMql(_paramCache,
                new StringBuilder().append("list type '").append(this.busType).append("'"));
        return (tmp.length() > 0);
    }

    /**
     * Returns the list of attributes for business object which are ignored for
     * the update (means this attributes are not reseted). The method returns
     * only correct values if the initialize method was called!
     *
     * @return MX name of the business type definition
     * @see #busIgnoredAttributes
     */
    public Collection<String> getMxBusIgnoredAttributes()
    {
        return this.busIgnoredAttributes;
    }

    /**
     * Returns the related business policy name used within MX. The method
     * returns only correct values if the initialize method was called!
     *
     * @return MX name of the business type definition
     * @see #busPolicy
     */
    public String getMxBusPolicy()
    {
        return this.busPolicy;
    }

    /**
     * Returns the related both relationship used within MX. The method
     * returns only correct values if the initialize method was called!
     *
     * @return list of both relationships
     * @see #busRelsBoth
     */
    public Collection<String> getMxBusRelsBoth()
    {
        return this.busRelsBoth;
    }

    /**
     * Returns the related from relationship used within MX. The method
     * returns only correct values if the initialize method was called!
     *
     * @return list of from relationships
     * @see #busRelsFrom
     */
    public Collection<String> getMxBusRelsFrom()
    {
        return this.busRelsFrom;
    }

    /**
     * Returns the related from relationship used within MX. The method
     * returns only correct values if the initialize method was called!
     *
     * @return list of from relationships
     * @see #busRelsTo
     */
    public Collection<String> getMxBusRelsTo()
    {
        return this.busRelsTo;
    }

    /**
     * Returns the related business type name used within MX. The method
     * returns only correct values if the initialize method was called!
     *
     * @return MX name of the business type definition
     * @see #busType
     */
    public String getMxBusType()
    {
        return this.busType;
    }

    /**
     * Returns if business objects are using types which are derived from given
     * {@link #busType business type}.
     *
     * @return <i>true</i> if business objects are using derived business
     *          types; otherwise <i>false</i>
     * @see #busTypeDerived
     */
    public boolean hasMxBusTypeDerived()
    {
        return this.busTypeDerived;
    }

    /**
     * Returns the related business vault name used within MX. The method
     * returns only correct values if the initialize method was called!
     *
     * @return MX name of the business vault definition
     * @see #busVault
     */
    public String getMxBusVault()
    {
        return this.busVault;
    }

    /**
     * Return <i>true</i> if matching files must be checked on last position
     * after file name checks for all other types. Only if a file before does
     * not match, this files could be checked against this type. If this
     * behavior for matching files is not required, a <i>false</i> is returned.
     * The parameter is only evaluated it the path parameter is defined!
     *
     * @return <i>true</i> if matching files must be checked at last (after all
     *         other types are checked); otherwise <i>false</i>
     * @see #fileMatchLast
     */
    public boolean isFileMatchLast()
    {
        return this.fileMatchLast;
    }

    /**
     * Returns the related file path. The method returns only correct
     * values if the initialize method was called!
     *
     * @return file path of the administration type definition
     * @see #filePath
     */
    public String getFilePath()
    {
        return this.filePath;
    }

    /**
     * Returns the related file name prefix. The method returns only
     * correct values if the initialize method was called!
     *
     * @return file name prefix of the administration type definition
     * @see #filePrefix
     */
    public String getFilePrefix()
    {
        return this.filePrefix;
    }

    /**
     * Returns the related file name suffix. The method returns only
     * correct values if the initialize method was called!
     *
     * @return file name prefix of the administration type definition
     * @see #fileSuffix
     */
    public String getFileSuffix()
    {
        return this.fileSuffix;
    }

    /**
     * Returns the related icon path. The method returns only correct values if
     * the initialize method was called!
     *
     * @return icon path for this type definition
     * @see #iconPath
     */
    public String getIconPath()
    {
        return this.iconPath;
    }

    /**
     * Returns the related logging string. The method returns only correct
     * values if the initialize method was called!
     *
     * @return logging string of the administration type definition
     * @see #textLogging
     */
    public String getLogging()
    {
        return this.textLogging;
    }

    /**
     * Returns the related title used in the MX update files. The method
     * returns only correct values if the initialize method was called!
     *
     * @return title of the business type definition
     * @see #textTitle
     */
    public String getTitle()
    {
        return this.textTitle;
    }

    /**
     *
     * @param _mxName   MX name of the new instance
     * @return instance of the administration object used for create, update or
     *                  delete
     * @throws NoSuchMethodException        if the constructor with
     *                                      {@link TypeDef_mxJPO} and
     *                                      {@link String} does not exists
     * @throws InstantiationException       if a new instance of the class
     *                                      {@link #jpoClass} could not be
     *                                      created
     * @throws IllegalAccessException       if the constructor is not public
     * @throws InvocationTargetException    if the constructor of the
     *                                      {@link #jpoClass} itself throws an
     *                                      exception
     */
    public AbstractObject_mxJPO newTypeInstance(final String _mxName)
            throws NoSuchMethodException, InstantiationException,
                   IllegalAccessException, InvocationTargetException
    {
        return this.jpoClass.getConstructor(TypeDef_mxJPO.class, String.class)
                            .newInstance(this, _mxName);
    }

    /**
     * Compares this type definition with the <code>_other</code> type
     * definition. First the {@link #orderNo order number} is compared. If the
     * {@link #orderNo order number} is equal, the {@link #getName() name} is
     * compared.
     *
     * @param _other    other type definition to compare
     * @return negative integer, zero, or positive integer as this object is
     *         less than, equal to, or greater than the specified object
     */
    @Override()
    public int compareTo(final TypeDef_mxJPO _other)
    {
        int ret = Integer.valueOf(this.orderNo).compareTo(_other.orderNo);
        if (ret == 0)  {
            ret = this.getName().compareTo(_other.getName());
        }
        return ret;
    }
}
